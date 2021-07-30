package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.ToiletPaperSlash: ImageVector
    get() {
        if (_toiletPaperSlash != null) {
            return _toiletPaperSlash!!
        }
        _toiletPaperSlash = Builder(name = "ToiletPaperSlash", defaultWidth = 640.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 192.0f)
                verticalLineTo(364.13f)
                curveToRelative(0.0f, 41.12f, -9.75f, 62.75f, -31.12f, 126.87f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 48.0f, 512.0f)
                horizontalLineTo(328.86f)
                arcToRelative(31.87f, 31.87f, 0.0f, false, false, 30.38f, -21.87f)
                curveToRelative(9.31f, -27.83f, 18.0f, -53.35f, 22.18f, -85.55f)
                lineToRelative(-316.0f, -244.25f)
                curveTo(64.53f, 170.66f, 64.0f, 181.19f, 64.0f, 192.0f)
                close()
                moveTo(633.82f, 458.09f)
                lineToRelative(-102.0f, -78.81f)
                curveTo(575.28f, 360.91f, 608.0f, 284.32f, 608.0f, 192.0f)
                curveTo(608.0f, 86.0f, 565.0f, 0.0f, 512.0f, 0.0f)
                reflectiveCurveToRelative(-96.0f, 86.0f, -96.0f, 192.0f)
                curveToRelative(0.0f, 42.0f, 7.0f, 80.4f, 18.43f, 112.0f)
                lineTo(384.0f, 265.0f)
                verticalLineTo(192.0f)
                curveToRelative(0.0f, -83.62f, 23.63f, -153.5f, 60.5f, -192.0f)
                horizontalLineTo(160.0f)
                curveToRelative(-23.33f, 0.0f, -44.63f, 16.83f, -61.26f, 44.53f)
                lineTo(45.46f, 3.38f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 23.0f, 6.19f)
                lineTo(3.37f, 31.45f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 6.18f, 53.91f)
                lineTo(594.54f, 508.63f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 617.0f, 505.81f)
                lineToRelative(19.64f, -25.26f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 633.82f, 458.09f)
                close()
                moveTo(512.0f, 256.0f)
                curveToRelative(-17.63f, 0.0f, -32.0f, -28.62f, -32.0f, -64.0f)
                reflectiveCurveToRelative(14.37f, -64.0f, 32.0f, -64.0f)
                reflectiveCurveToRelative(32.0f, 28.63f, 32.0f, 64.0f)
                reflectiveCurveTo(529.62f, 256.0f, 512.0f, 256.0f)
                close()
            }
        }
        .build()
        return _toiletPaperSlash!!
    }

private var _toiletPaperSlash: ImageVector? = null
