package compose.icons.studioicons.outline

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
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.AutoFixHigh: ImageVector
    get() {
        if (_autoFixHigh != null) {
            return _autoFixHigh!!
        }
        _autoFixHigh = Builder(name = "AutoFixHigh", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 7.0f)
                lineToRelative(0.94f, -2.06f)
                lineToRelative(2.06f, -0.94f)
                lineToRelative(-2.06f, -0.94f)
                lineToRelative(-0.94f, -2.06f)
                lineToRelative(-0.94f, 2.06f)
                lineToRelative(-2.06f, 0.94f)
                lineToRelative(2.06f, 0.94f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 7.0f)
                lineToRelative(0.94f, -2.06f)
                lineToRelative(2.06f, -0.94f)
                lineToRelative(-2.06f, -0.94f)
                lineToRelative(-0.94f, -2.06f)
                lineToRelative(-0.94f, 2.06f)
                lineToRelative(-2.06f, 0.94f)
                lineToRelative(2.06f, 0.94f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 12.5f)
                lineToRelative(-0.94f, 2.06f)
                lineToRelative(-2.06f, 0.94f)
                lineToRelative(2.06f, 0.94f)
                lineToRelative(0.94f, 2.06f)
                lineToRelative(0.94f, -2.06f)
                lineToRelative(2.06f, -0.94f)
                lineToRelative(-2.06f, -0.94f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.71f, 9.12f)
                lineToRelative(-2.83f, -2.83f)
                curveTo(14.68f, 6.1f, 14.43f, 6.0f, 14.17f, 6.0f)
                curveToRelative(-0.26f, 0.0f, -0.51f, 0.1f, -0.71f, 0.29f)
                lineTo(2.29f, 17.46f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(2.83f, 2.83f)
                curveTo(5.32f, 21.9f, 5.57f, 22.0f, 5.83f, 22.0f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                lineToRelative(11.17f, -11.17f)
                curveTo(18.1f, 10.15f, 18.1f, 9.51f, 17.71f, 9.12f)
                close()
                moveTo(14.17f, 8.42f)
                lineToRelative(1.41f, 1.41f)
                lineTo(14.41f, 11.0f)
                lineTo(13.0f, 9.59f)
                lineTo(14.17f, 8.42f)
                close()
                moveTo(5.83f, 19.59f)
                lineToRelative(-1.41f, -1.41f)
                lineTo(11.59f, 11.0f)
                lineTo(13.0f, 12.41f)
                lineTo(5.83f, 19.59f)
                close()
            }
        }
        .build()
        return _autoFixHigh!!
    }

private var _autoFixHigh: ImageVector? = null
