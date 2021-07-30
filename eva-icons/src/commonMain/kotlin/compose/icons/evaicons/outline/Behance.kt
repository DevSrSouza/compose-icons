package compose.icons.evaicons.outline

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
import compose.icons.evaicons.OutlineGroup

public val OutlineGroup.Behance: ImageVector
    get() {
        if (_behance != null) {
            return _behance!!
        }
        _behance = Builder(name = "Behance", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(-24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, false, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 20.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 12.0f, 20.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.52f, 11.78f)
                verticalLineToRelative(0.0f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, false, 1.12f, -1.43f)
                curveToRelative(0.0f, -1.0f, -0.77f, -1.6f, -1.94f, -1.6f)
                lineTo(7.0f, 8.75f)
                verticalLineToRelative(6.5f)
                lineTo(9.7f, 15.25f)
                curveTo(11.0f, 15.2f, 12.0f, 14.53f, 12.0f, 13.37f)
                arcTo(1.52f, 1.52f, 0.0f, false, false, 10.52f, 11.78f)
                close()
                moveTo(8.26f, 9.67f)
                lineTo(9.41f, 9.67f)
                curveToRelative(0.6f, 0.0f, 0.95f, 0.32f, 0.95f, 0.85f)
                reflectiveCurveToRelative(-0.38f, 0.89f, -1.25f, 0.89f)
                lineTo(8.26f, 11.41f)
                close()
                moveTo(9.26f, 14.24f)
                horizontalLineToRelative(-1.0f)
                lineTo(8.26f, 12.3f)
                lineTo(9.49f, 12.3f)
                curveToRelative(0.75f, 0.0f, 1.17f, 0.38f, 1.17f, 1.0f)
                reflectiveCurveTo(10.24f, 14.24f, 9.22f, 14.24f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.75f, 10.3f)
                arcToRelative(2.11f, 2.11f, 0.0f, false, false, -2.28f, 2.25f)
                lineTo(12.47f, 13.0f)
                arcToRelative(2.15f, 2.15f, 0.0f, false, false, 2.34f, 2.31f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.0f, 13.75f)
                lineTo(15.79f, 13.75f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, true, -1.0f, 0.63f)
                arcToRelative(1.07f, 1.07f, 0.0f, false, true, -1.09f, -1.19f)
                verticalLineToRelative(-0.14f)
                lineTo(17.0f, 13.05f)
                verticalLineToRelative(-0.47f)
                arcTo(2.12f, 2.12f, 0.0f, false, false, 14.75f, 10.3f)
                close()
                moveTo(15.75f, 12.3f)
                lineTo(13.73f, 12.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.09f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.09f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.25f, 9.2f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _behance!!
    }

private var _behance: ImageVector? = null
