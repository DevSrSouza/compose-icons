package compose.icons.evaicons.fill

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
import compose.icons.evaicons.FillGroup

public val FillGroup.Behance: ImageVector
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
                moveTo(14.76f, 11.19f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.09f)
                horizontalLineToRelative(2.06f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.76f, 11.19f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.49f, 12.3f)
                horizontalLineTo(8.26f)
                verticalLineToRelative(1.94f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.0f, 0.0f, 1.44f, -0.33f, 1.44f, -1.0f)
                reflectiveCurveTo(10.24f, 12.3f, 9.49f, 12.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.36f, 10.52f)
                curveToRelative(0.0f, -0.53f, -0.35f, -0.85f, -0.95f, -0.85f)
                horizontalLineTo(8.26f)
                verticalLineToRelative(1.74f)
                horizontalLineToRelative(0.85f)
                curveTo(10.0f, 11.41f, 10.36f, 11.09f, 10.36f, 10.52f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, false, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 2.0f)
                close()
                moveTo(9.7f, 15.2f)
                lineTo(7.0f, 15.2f)
                lineTo(7.0f, 8.7f)
                lineTo(9.7f, 8.7f)
                curveToRelative(1.17f, 0.0f, 1.94f, 0.61f, 1.94f, 1.6f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, true, -1.12f, 1.43f)
                verticalLineToRelative(0.0f)
                arcTo(1.52f, 1.52f, 0.0f, false, true, 12.0f, 13.37f)
                curveTo(12.0f, 14.53f, 11.0f, 15.2f, 9.7f, 15.2f)
                close()
                moveTo(13.25f, 9.2f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(17.0f, 13.05f)
                horizontalLineToRelative(-3.3f)
                verticalLineToRelative(0.14f)
                arcToRelative(1.07f, 1.07f, 0.0f, false, false, 1.09f, 1.19f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, false, 1.0f, -0.63f)
                lineTo(17.0f, 13.75f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.17f, 1.55f)
                arcTo(2.15f, 2.15f, 0.0f, false, true, 12.47f, 13.0f)
                verticalLineToRelative(-0.44f)
                arcToRelative(2.11f, 2.11f, 0.0f, false, true, 2.28f, -2.25f)
                arcTo(2.12f, 2.12f, 0.0f, false, true, 17.0f, 12.58f)
                close()
            }
        }
        .build()
        return _behance!!
    }

private var _behance: ImageVector? = null
