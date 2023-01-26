package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.LinkedCamera: ImageVector
    get() {
        if (_linkedCamera != null) {
            return _linkedCamera!!
        }
        _linkedCamera = Builder(name = "LinkedCamera", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 9.0f)
                verticalLineToRelative(11.0f)
                lineTo(4.0f, 20.0f)
                lineTo(4.0f, 8.0f)
                horizontalLineToRelative(4.05f)
                lineToRelative(1.83f, -2.0f)
                lineTo(15.0f, 6.0f)
                lineTo(15.0f, 4.0f)
                lineTo(9.0f, 4.0f)
                lineTo(7.17f, 6.0f)
                lineTo(4.0f, 6.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(22.0f, 9.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(20.67f, 7.99f)
                lineTo(22.0f, 7.99f)
                curveTo(21.99f, 4.68f, 19.31f, 2.0f, 16.0f, 2.0f)
                verticalLineToRelative(1.33f)
                curveToRelative(2.58f, 0.0f, 4.66f, 2.08f, 4.67f, 4.66f)
                close()
                moveTo(18.0f, 7.99f)
                horizontalLineToRelative(1.33f)
                curveToRelative(-0.01f, -1.84f, -1.49f, -3.32f, -3.33f, -3.32f)
                lineTo(16.0f, 6.0f)
                curveToRelative(1.11f, 0.0f, 1.99f, 0.89f, 2.0f, 1.99f)
                close()
                moveTo(7.0f, 14.0f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f)
                reflectiveCurveToRelative(-2.24f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.24f, -5.0f, 5.0f)
                close()
                moveTo(15.0f, 14.0f)
                curveToRelative(0.0f, 1.65f, -1.35f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.35f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.35f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _linkedCamera!!
    }

private var _linkedCamera: ImageVector? = null
