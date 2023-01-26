package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.SubdirectoryArrowRight: ImageVector
    get() {
        if (_subdirectoryArrowRight != null) {
            return _subdirectoryArrowRight!!
        }
        _subdirectoryArrowRight = Builder(name = "SubdirectoryArrowRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.29f, 15.71f)
                lineToRelative(-4.58f, 4.58f)
                curveToRelative(-0.39f, 0.39f, -1.03f, 0.39f, -1.42f, 0.0f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.03f, 0.0f, -1.42f)
                lineTo(15.17f, 16.0f)
                horizontalLineTo(5.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineTo(5.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(9.17f)
                lineToRelative(-2.88f, -2.87f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.03f, 0.0f, -1.42f)
                curveToRelative(0.39f, -0.39f, 1.03f, -0.39f, 1.42f, 0.0f)
                lineToRelative(4.58f, 4.58f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.03f, 0.0f, 1.42f)
                close()
            }
        }
        .build()
        return _subdirectoryArrowRight!!
    }

private var _subdirectoryArrowRight: ImageVector? = null
