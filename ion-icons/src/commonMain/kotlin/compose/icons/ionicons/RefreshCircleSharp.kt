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

public val IonIcons.RefreshCircleSharp: ImageVector
    get() {
        if (_refreshCircleSharp != null) {
            return _refreshCircleSharp!!
        }
        _refreshCircleSharp = Builder(name = "RefreshCircleSharp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                curveTo(141.31f, 48.0f, 48.0f, 141.32f, 48.0f, 256.0f)
                curveToRelative(0.0f, 114.86f, 93.14f, 208.0f, 208.0f, 208.0f)
                curveToRelative(114.69f, 0.0f, 208.0f, -93.31f, 208.0f, -208.0f)
                curveTo(464.0f, 141.13f, 370.87f, 48.0f, 256.0f, 48.0f)
                close()
                moveTo(350.0f, 267.0f)
                arcToRelative(94.0f, 94.0f, 0.0f, true, true, -94.0f, -94.0f)
                horizontalLineToRelative(4.21f)
                lineToRelative(-24.0f, -24.0f)
                lineTo(256.0f, 129.2f)
                lineTo(315.8f, 189.0f)
                lineTo(256.0f, 248.8f)
                lineTo(236.2f, 229.0f)
                lineToRelative(27.92f, -27.92f)
                curveTo(261.72f, 201.0f, 259.0f, 201.0f, 256.0f, 201.0f)
                arcToRelative(66.0f, 66.0f, 0.0f, true, false, 66.0f, 66.0f)
                lineTo(322.0f, 253.0f)
                horizontalLineToRelative(28.0f)
                close()
            }
        }
        .build()
        return _refreshCircleSharp!!
    }

private var _refreshCircleSharp: ImageVector? = null
