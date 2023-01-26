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

public val RoundGroup.SaveAs: ImageVector
    get() {
        if (_saveAs != null) {
            return _saveAs!!
        }
        _saveAs = Builder(name = "SaveAs", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.41f, 6.41f)
                lineToRelative(-2.83f, -2.83f)
                curveTo(17.21f, 3.21f, 16.7f, 3.0f, 16.17f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(7.4f)
                lineToRelative(8.6f, -8.6f)
                verticalLineTo(7.83f)
                curveTo(21.0f, 7.3f, 20.79f, 6.79f, 20.41f, 6.41f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f)
                reflectiveCurveTo(13.66f, 18.0f, 12.0f, 18.0f)
                close()
                moveTo(15.0f, 9.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineTo(7.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineTo(7.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(19.99f, 16.25f)
                lineToRelative(1.77f, 1.77f)
                lineToRelative(-4.84f, 4.84f)
                curveTo(16.82f, 22.95f, 16.69f, 23.0f, 16.56f, 23.0f)
                horizontalLineTo(15.5f)
                curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-1.06f)
                curveToRelative(0.0f, -0.13f, 0.05f, -0.26f, 0.15f, -0.35f)
                lineTo(19.99f, 16.25f)
                close()
                moveTo(23.25f, 16.51f)
                lineToRelative(-0.85f, 0.85f)
                lineToRelative(-1.77f, -1.77f)
                lineToRelative(0.85f, -0.85f)
                curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0.0f)
                lineToRelative(1.06f, 1.06f)
                curveTo(23.45f, 16.0f, 23.45f, 16.32f, 23.25f, 16.51f)
                close()
            }
        }
        .build()
        return _saveAs!!
    }

private var _saveAs: ImageVector? = null
