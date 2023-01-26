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

public val RoundGroup.HdrPlus: ImageVector
    get() {
        if (_hdrPlus != null) {
            return _hdrPlus!!
        }
        _hdrPlus = Builder(name = "HdrPlus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 14.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 7.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f)
                reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 15.5f)
                curveToRelative(0.0f, 0.6f, -0.4f, 1.1f, -0.9f, 1.4f)
                lineToRelative(0.49f, 1.13f)
                curveToRelative(0.2f, 0.46f, -0.14f, 0.97f, -0.64f, 0.97f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.27f, 0.0f, -0.52f, -0.16f, -0.63f, -0.41f)
                lineTo(9.6f, 17.0f)
                horizontalLineTo(8.5f)
                verticalLineToRelative(1.31f)
                curveTo(8.5f, 18.69f, 8.19f, 19.0f, 7.81f, 19.0f)
                horizontalLineTo(7.69f)
                curveTo(7.31f, 19.0f, 7.0f, 18.69f, 7.0f, 18.31f)
                verticalLineTo(14.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.82f, 0.0f, 1.5f, 0.68f, 1.5f, 1.5f)
                verticalLineTo(15.5f)
                close()
                moveTo(11.25f, 12.0f)
                lineTo(11.25f, 12.0f)
                curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f)
                verticalLineTo(9.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.75f)
                curveTo(8.5f, 11.66f, 8.16f, 12.0f, 7.75f, 12.0f)
                horizontalLineToRelative(0.0f)
                curveTo(7.34f, 12.0f, 7.0f, 11.66f, 7.0f, 11.25f)
                verticalLineToRelative(-4.5f)
                curveTo(7.0f, 6.34f, 7.34f, 6.0f, 7.75f, 6.0f)
                horizontalLineToRelative(0.0f)
                curveTo(8.16f, 6.0f, 8.5f, 6.34f, 8.5f, 6.75f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(6.75f)
                curveTo(10.5f, 6.34f, 10.84f, 6.0f, 11.25f, 6.0f)
                horizontalLineToRelative(0.0f)
                curveTo(11.66f, 6.0f, 12.0f, 6.34f, 12.0f, 6.75f)
                verticalLineToRelative(4.5f)
                curveTo(12.0f, 11.66f, 11.66f, 12.0f, 11.25f, 12.0f)
                close()
                moveTo(16.75f, 16.0f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(0.75f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f)
                verticalLineTo(16.0f)
                horizontalLineToRelative(-0.75f)
                curveTo(13.34f, 16.0f, 13.0f, 15.66f, 13.0f, 15.25f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(0.75f)
                verticalLineToRelative(-0.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(0.74f)
                horizontalLineToRelative(0.75f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(0.01f)
                curveTo(17.5f, 15.66f, 17.16f, 16.0f, 16.75f, 16.0f)
                close()
                moveTo(17.5f, 10.5f)
                curveToRelative(0.0f, 0.82f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-5.0f)
                curveTo(13.0f, 6.22f, 13.22f, 6.0f, 13.5f, 6.0f)
                horizontalLineTo(16.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.68f, 1.5f, 1.5f)
                verticalLineTo(10.5f)
                close()
            }
        }
        .build()
        return _hdrPlus!!
    }

private var _hdrPlus: ImageVector? = null
