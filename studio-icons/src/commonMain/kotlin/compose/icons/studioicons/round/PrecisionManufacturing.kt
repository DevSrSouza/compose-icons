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

public val RoundGroup.PrecisionManufacturing: ImageVector
    get() {
        if (_precisionManufacturing != null) {
            return _precisionManufacturing!!
        }
        _precisionManufacturing = Builder(name = "PrecisionManufacturing", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.93f, 8.35f)
                lineToRelative(-3.6f, 1.68f)
                lineTo(14.0f, 7.7f)
                verticalLineTo(6.3f)
                lineToRelative(2.33f, -2.33f)
                lineToRelative(3.6f, 1.68f)
                curveToRelative(0.38f, 0.18f, 0.82f, 0.01f, 1.0f, -0.36f)
                curveToRelative(0.18f, -0.38f, 0.01f, -0.82f, -0.36f, -1.0f)
                lineToRelative(-3.92f, -1.83f)
                curveToRelative(-0.38f, -0.18f, -0.83f, -0.1f, -1.13f, 0.2f)
                lineTo(13.78f, 4.4f)
                curveTo(13.6f, 4.16f, 13.32f, 4.0f, 13.0f, 4.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(8.82f)
                curveTo(8.34f, 4.66f, 6.96f, 3.75f, 5.4f, 4.06f)
                curveTo(4.23f, 4.29f, 3.27f, 5.25f, 3.05f, 6.42f)
                curveTo(2.8f, 7.76f, 3.45f, 8.96f, 4.48f, 9.58f)
                lineTo(7.08f, 18.0f)
                horizontalLineTo(5.5f)
                curveTo(4.67f, 18.0f, 4.0f, 18.67f, 4.0f, 19.5f)
                verticalLineToRelative(0.0f)
                curveTo(4.0f, 20.33f, 4.67f, 21.0f, 5.5f, 21.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-2.12f)
                lineTo(8.41f, 8.77f)
                curveTo(8.58f, 8.53f, 8.72f, 8.28f, 8.82f, 8.0f)
                horizontalLineTo(12.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                curveToRelative(0.32f, 0.0f, 0.6f, -0.16f, 0.78f, -0.4f)
                lineToRelative(1.74f, 1.74f)
                curveToRelative(0.3f, 0.3f, 0.75f, 0.38f, 1.13f, 0.2f)
                lineToRelative(3.92f, -1.83f)
                curveToRelative(0.38f, -0.18f, 0.54f, -0.62f, 0.36f, -1.0f)
                curveTo(20.75f, 8.34f, 20.31f, 8.17f, 19.93f, 8.35f)
                close()
                moveTo(6.0f, 8.0f)
                curveTo(5.45f, 8.0f, 5.0f, 7.55f, 5.0f, 7.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                curveTo(7.0f, 7.55f, 6.55f, 8.0f, 6.0f, 8.0f)
                close()
            }
        }
        .build()
        return _precisionManufacturing!!
    }

private var _precisionManufacturing: ImageVector? = null