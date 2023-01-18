package compose.icons.ionicons

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
import compose.icons.IonIcons

public val IonIcons.Wallet: ImageVector
    get() {
        if (_wallet != null) {
            return _wallet!!
        }
        _wallet = Builder(name = "Wallet", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(95.5f, 104.0f)
                horizontalLineToRelative(320.0f)
                arcToRelative(87.73f, 87.73f, 0.0f, false, true, 11.18f, 0.71f)
                arcToRelative(66.0f, 66.0f, 0.0f, false, false, -77.51f, -55.56f)
                lineTo(86.0f, 94.08f)
                lineToRelative(-0.3f, 0.0f)
                arcToRelative(66.0f, 66.0f, 0.0f, false, false, -41.07f, 26.13f)
                arcTo(87.57f, 87.57f, 0.0f, false, true, 95.5f, 104.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(415.5f, 128.0f)
                horizontalLineTo(95.5f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, false, -64.0f, 64.0f)
                verticalLineTo(384.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, false, 64.0f, 64.0f)
                horizontalLineToRelative(320.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, false, 64.0f, -64.0f)
                verticalLineTo(192.0f)
                arcTo(64.07f, 64.07f, 0.0f, false, false, 415.5f, 128.0f)
                close()
                moveTo(368.0f, 320.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 368.0f, 320.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 259.5f)
                verticalLineTo(160.0f)
                curveToRelative(0.0f, -21.67f, 12.0f, -58.0f, 53.65f, -65.87f)
                curveTo(121.0f, 87.5f, 156.0f, 87.5f, 156.0f, 87.5f)
                reflectiveCurveToRelative(23.0f, 16.0f, 4.0f, 16.0f)
                reflectiveCurveTo(141.5f, 128.0f, 160.0f, 128.0f)
                reflectiveCurveToRelative(0.0f, 23.5f, 0.0f, 23.5f)
                lineTo(85.5f, 236.0f)
                close()
            }
        }
        .build()
        return _wallet!!
    }

private var _wallet: ImageVector? = null
