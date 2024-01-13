package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Maildotcom: ImageVector
    get() {
        if (_maildotcom != null) {
            return _maildotcom!!
        }
        _maildotcom = Builder(name = "Maildotcom", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.017f, -0.0085f)
                lineTo(0.0f, -0.0085f)
                lineTo(0.0f, 15.66f)
                curveToRelative(0.0f, 1.4057f, 0.96f, 2.5714f, 2.2457f, 2.9143f)
                lineTo(24.0f, 24.0085f)
                lineTo(24.0f, 5.9915f)
                curveToRelative(0.0172f, -3.3086f, -2.6743f, -6.0f, -5.9828f, -6.0f)
                close()
                moveTo(21.017f, 15.66f)
                lineTo(18.0f, 15.66f)
                lineTo(18.0f, 8.7857f)
                curveToRelative(0.0f, -0.6685f, -0.223f, -2.2285f, -2.2115f, -2.2285f)
                curveToRelative(-1.32f, 0.0f, -2.28f, 0.9085f, -2.28f, 2.2285f)
                lineTo(13.5085f, 15.66f)
                horizontalLineToRelative(-3.0171f)
                lineTo(10.4914f, 8.7857f)
                curveToRelative(0.0f, -0.6685f, -0.2057f, -2.2285f, -2.1943f, -2.2285f)
                curveToRelative(-1.3543f, 0.0f, -2.28f, 0.9085f, -2.28f, 2.2285f)
                lineTo(6.0171f, 15.66f)
                lineTo(3.0f, 15.66f)
                lineTo(3.0f, 3.6086f)
                horizontalLineToRelative(5.297f)
                curveToRelative(1.5943f, 0.0f, 2.8971f, 0.6343f, 3.7371f, 1.6629f)
                curveToRelative(0.8915f, -1.0286f, 2.2115f, -1.6629f, 3.7372f, -1.6629f)
                curveToRelative(3.2914f, 0.0f, 5.2285f, 2.1771f, 5.2285f, 5.2457f)
                lineToRelative(0.0172f, 6.8057f)
                close()
            }
        }
        .build()
        return _maildotcom!!
    }

private var _maildotcom: ImageVector? = null
