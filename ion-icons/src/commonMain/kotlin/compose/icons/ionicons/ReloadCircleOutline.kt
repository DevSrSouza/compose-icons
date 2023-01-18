package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.ReloadCircleOutline: ImageVector
    get() {
        if (_reloadCircleOutline != null) {
            return _reloadCircleOutline!!
        }
        _reloadCircleOutline = Builder(name = "ReloadCircleOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(448.0f, 256.0f)
                curveToRelative(0.0f, -106.0f, -86.0f, -192.0f, -192.0f, -192.0f)
                reflectiveCurveTo(64.0f, 150.0f, 64.0f, 256.0f)
                reflectiveCurveToRelative(86.0f, 192.0f, 192.0f, 192.0f)
                reflectiveCurveTo(448.0f, 362.0f, 448.0f, 256.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(341.54f, 197.85f)
                lineToRelative(-11.37f, -13.23f)
                arcToRelative(103.37f, 103.37f, 0.0f, true, false, 22.71f, 105.84f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(367.32f, 162.0f)
                arcToRelative(8.44f, 8.44f, 0.0f, false, false, -6.0f, 2.54f)
                lineToRelative(-59.54f, 59.54f)
                arcToRelative(8.61f, 8.61f, 0.0f, false, false, 6.09f, 14.71f)
                horizontalLineToRelative(59.54f)
                arcToRelative(8.62f, 8.62f, 0.0f, false, false, 8.62f, -8.62f)
                verticalLineTo(170.61f)
                arcToRelative(8.61f, 8.61f, 0.0f, false, false, -8.68f, -8.63f)
                close()
            }
        }
        .build()
        return _reloadCircleOutline!!
    }

private var _reloadCircleOutline: ImageVector? = null
