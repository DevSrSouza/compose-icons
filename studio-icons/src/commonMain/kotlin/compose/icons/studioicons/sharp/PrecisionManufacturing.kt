package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.PrecisionManufacturing: ImageVector
    get() {
        if (_precisionManufacturing != null) {
            return _precisionManufacturing!!
        }
        _precisionManufacturing = Builder(name = "PrecisionManufacturing", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 10.0f)
                verticalLineTo(9.82f)
                lineToRelative(2.01f, 2.01f)
                lineToRelative(5.23f, -2.44f)
                lineToRelative(-0.63f, -1.36f)
                lineToRelative(-4.28f, 2.0f)
                lineTo(14.0f, 7.7f)
                verticalLineTo(6.3f)
                lineToRelative(2.33f, -2.33f)
                lineToRelative(4.28f, 2.0f)
                lineToRelative(0.63f, -1.36f)
                lineToRelative(-5.23f, -2.44f)
                lineTo(14.0f, 4.18f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(8.82f)
                curveTo(8.4f, 4.84f, 7.3f, 4.0f, 6.0f, 4.0f)
                curveTo(4.34f, 4.0f, 3.0f, 5.34f, 3.0f, 7.0f)
                curveToRelative(0.0f, 1.1f, 0.6f, 2.05f, 1.48f, 2.58f)
                lineTo(7.08f, 18.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.62f)
                lineTo(8.41f, 8.76f)
                curveTo(8.58f, 8.53f, 8.72f, 8.28f, 8.82f, 8.0f)
                horizontalLineTo(12.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(14.0f)
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
