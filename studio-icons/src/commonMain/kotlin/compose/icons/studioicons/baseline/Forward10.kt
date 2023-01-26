package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.Forward10: ImageVector
    get() {
        if (_forward10 != null) {
            return _forward10!!
        }
        _forward10 = Builder(name = "Forward10", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 13.0f)
                curveToRelative(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.69f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.69f, -6.0f, 6.0f, -6.0f)
                verticalLineToRelative(4.0f)
                lineToRelative(5.0f, -5.0f)
                lineToRelative(-5.0f, -5.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f)
                curveToRelative(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f)
                reflectiveCurveToRelative(8.0f, -3.58f, 8.0f, -8.0f)
                horizontalLineTo(18.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.86f, 15.94f)
                lineToRelative(0.0f, -4.27f)
                lineToRelative(-0.09f, 0.0f)
                lineToRelative(-1.77f, 0.63f)
                lineToRelative(0.0f, 0.69f)
                lineToRelative(1.01f, -0.31f)
                lineToRelative(0.0f, 3.26f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.25f, 13.44f)
                verticalLineToRelative(0.74f)
                curveToRelative(0.0f, 1.9f, 1.31f, 1.82f, 1.44f, 1.82f)
                curveToRelative(0.14f, 0.0f, 1.44f, 0.09f, 1.44f, -1.82f)
                verticalLineToRelative(-0.74f)
                curveToRelative(0.0f, -1.9f, -1.31f, -1.82f, -1.44f, -1.82f)
                curveTo(13.55f, 11.62f, 12.25f, 11.53f, 12.25f, 13.44f)
                close()
                moveTo(14.29f, 13.32f)
                verticalLineToRelative(0.97f)
                curveToRelative(0.0f, 0.77f, -0.21f, 1.03f, -0.59f, 1.03f)
                curveToRelative(-0.38f, 0.0f, -0.6f, -0.26f, -0.6f, -1.03f)
                verticalLineToRelative(-0.97f)
                curveToRelative(0.0f, -0.75f, 0.22f, -1.01f, 0.59f, -1.01f)
                curveTo(14.07f, 12.3f, 14.29f, 12.57f, 14.29f, 13.32f)
                close()
            }
        }
        .build()
        return _forward10!!
    }

private var _forward10: ImageVector? = null
