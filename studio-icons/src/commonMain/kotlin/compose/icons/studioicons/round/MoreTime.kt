package compose.icons.studioicons.round

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
import compose.icons.studioicons.RoundGroup

public val RoundGroup.MoreTime: ImageVector
    get() {
        if (_moreTime != null) {
            return _moreTime!!
        }
        _moreTime = Builder(name = "MoreTime", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.75f, 8.0f)
                curveTo(10.34f, 8.0f, 10.0f, 8.34f, 10.0f, 8.75f)
                verticalLineToRelative(4.69f)
                curveToRelative(0.0f, 0.35f, 0.18f, 0.67f, 0.47f, 0.85f)
                lineToRelative(3.64f, 2.24f)
                curveToRelative(0.33f, 0.2f, 0.76f, 0.11f, 0.97f, -0.21f)
                curveToRelative(0.23f, -0.34f, 0.12f, -0.8f, -0.23f, -1.01f)
                lineTo(11.5f, 13.3f)
                verticalLineTo(8.75f)
                curveTo(11.5f, 8.34f, 11.16f, 8.0f, 10.75f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.92f, 12.0f)
                curveToRelative(0.05f, 0.33f, 0.08f, 0.66f, 0.08f, 1.0f)
                curveToRelative(0.0f, 3.9f, -3.1f, 7.0f, -7.0f, 7.0f)
                reflectiveCurveToRelative(-7.0f, -3.1f, -7.0f, -7.0f)
                curveToRelative(0.0f, -3.9f, 3.1f, -7.0f, 7.0f, -7.0f)
                curveToRelative(0.7f, 0.0f, 1.37f, 0.1f, 2.0f, 0.29f)
                verticalLineTo(4.23f)
                curveTo(12.36f, 4.08f, 11.69f, 4.0f, 11.0f, 4.0f)
                curveToRelative(-5.0f, 0.0f, -9.0f, 4.0f, -9.0f, 9.0f)
                reflectiveCurveToRelative(4.0f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.0f, 9.0f, -9.0f)
                curveToRelative(0.0f, -0.34f, -0.02f, -0.67f, -0.06f, -1.0f)
                horizontalLineTo(17.92f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(3.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                curveTo(23.0f, 5.45f, 22.55f, 5.0f, 22.0f, 5.0f)
                close()
            }
        }
        .build()
        return _moreTime!!
    }

private var _moreTime: ImageVector? = null
