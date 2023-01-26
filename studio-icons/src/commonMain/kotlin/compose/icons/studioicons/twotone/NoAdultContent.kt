package compose.icons.studioicons.twotone

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
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.NoAdultContent: ImageVector
    get() {
        if (_noAdultContent != null) {
            return _noAdultContent!!
        }
        _noAdultContent = Builder(name = "NoAdultContent", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f)
                reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(4.0f, 12.0f)
                curveToRelative(0.0f, -1.85f, 0.63f, -3.54f, 1.69f, -4.9f)
                lineTo(7.59f, 9.0f)
                horizontalLineToRelative(2.83f)
                lineTo(7.1f, 5.69f)
                curveTo(8.46f, 4.63f, 10.15f, 4.0f, 12.0f, 4.0f)
                curveToRelative(4.41f, 0.0f, 8.0f, 3.59f, 8.0f, 8.0f)
                curveToRelative(0.0f, 1.85f, -0.63f, 3.54f, -1.69f, 4.9f)
                lineToRelative(-1.9f, -1.9f)
                horizontalLineToRelative(-2.83f)
                lineToRelative(3.31f, 3.31f)
                curveTo(15.54f, 19.37f, 13.85f, 20.0f, 12.0f, 20.0f)
                curveTo(7.59f, 20.0f, 4.0f, 16.41f, 4.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.25f, 14.0f)
                lineToRelative(-1.5f, -2.0f)
                lineToRelative(1.5f, -2.0f)
                lineToRelative(-1.5f, 0.0f)
                lineToRelative(-0.75f, 1.0f)
                lineToRelative(-0.75f, -1.0f)
                lineToRelative(-1.5f, 0.0f)
                lineToRelative(1.5f, 2.0f)
                lineToRelative(-1.5f, 2.0f)
                lineToRelative(1.5f, 0.0f)
                lineToRelative(0.75f, -1.0f)
                lineToRelative(0.75f, 1.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 10.0f)
                lineToRelative(-0.75f, 1.0f)
                lineToRelative(-0.75f, -1.0f)
                lineToRelative(-1.5f, 0.0f)
                lineToRelative(1.5f, 2.0f)
                lineToRelative(-1.5f, 2.0f)
                lineToRelative(1.5f, 0.0f)
                lineToRelative(0.75f, -1.0f)
                lineToRelative(0.75f, 1.0f)
                lineToRelative(1.5f, 0.0f)
                lineToRelative(-1.5f, -2.0f)
                lineToRelative(1.5f, -2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 14.0f)
                lineToRelative(0.75f, -1.0f)
                lineToRelative(0.75f, 1.0f)
                lineToRelative(1.5f, 0.0f)
                lineToRelative(-1.5f, -2.0f)
                lineToRelative(1.5f, -2.0f)
                lineToRelative(-1.5f, 0.0f)
                lineToRelative(-0.75f, 1.0f)
                lineToRelative(-0.75f, -1.0f)
                lineToRelative(-1.5f, 0.0f)
                lineToRelative(1.5f, 2.0f)
                lineToRelative(-1.5f, 2.0f)
                close()
            }
        }
        .build()
        return _noAdultContent!!
    }

private var _noAdultContent: ImageVector? = null
