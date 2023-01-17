package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.CheckCircleFill24: ImageVector
    get() {
        if (_checkCircleFill24 != null) {
            return _checkCircleFill24!!
        }
        _checkCircleFill24 = Builder(name = "CheckCircleFill24", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 12.0f)
                curveTo(1.0f, 5.925f, 5.925f, 1.0f, 12.0f, 1.0f)
                reflectiveCurveToRelative(11.0f, 4.925f, 11.0f, 11.0f)
                reflectiveCurveToRelative(-4.925f, 11.0f, -11.0f, 11.0f)
                reflectiveCurveTo(1.0f, 18.075f, 1.0f, 12.0f)
                close()
                moveTo(17.28f, 9.28f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, false, -0.018f, -1.042f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, false, -1.042f, -0.018f)
                lineToRelative(-5.97f, 5.97f)
                lineToRelative(-2.47f, -2.47f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, false, -1.042f, 0.018f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, false, -0.018f, 1.042f)
                lineToRelative(3.0f, 3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, 0.0f)
                close()
            }
        }
        .build()
        return _checkCircleFill24!!
    }

private var _checkCircleFill24: ImageVector? = null
