package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.RefreshCircle: ImageVector
    get() {
        if (_refreshCircle != null) {
            return _refreshCircle!!
        }
        _refreshCircle = Builder(name = "RefreshCircle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                curveTo(141.31f, 48.0f, 48.0f, 141.32f, 48.0f, 256.0f)
                curveToRelative(0.0f, 114.86f, 93.14f, 208.0f, 208.0f, 208.0f)
                curveToRelative(114.69f, 0.0f, 208.0f, -93.31f, 208.0f, -208.0f)
                curveTo(464.0f, 141.13f, 370.87f, 48.0f, 256.0f, 48.0f)
                close()
                moveTo(256.0f, 361.0f)
                arcToRelative(94.0f, 94.0f, 0.0f, false, true, 0.0f, -188.0f)
                horizontalLineToRelative(4.21f)
                lineTo(246.1f, 158.9f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 19.8f, -19.8f)
                lineToRelative(40.0f, 40.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 0.0f, 19.8f)
                lineToRelative(-40.0f, 40.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -19.8f, -19.8f)
                lineToRelative(18.0f, -18.0f)
                curveTo(261.72f, 201.0f, 259.0f, 201.0f, 256.0f, 201.0f)
                arcToRelative(66.0f, 66.0f, 0.0f, true, false, 66.0f, 66.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 28.0f, 0.0f)
                arcTo(94.11f, 94.11f, 0.0f, false, true, 256.0f, 361.0f)
                close()
            }
        }
        .build()
        return _refreshCircle!!
    }

private var _refreshCircle: ImageVector? = null
