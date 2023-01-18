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

public val IonIcons.LogoMarkdown: ImageVector
    get() {
        if (_logoMarkdown != null) {
            return _logoMarkdown!!
        }
        _logoMarkdown = Builder(name = "LogoMarkdown", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(475.0f, 64.0f)
                lineTo(37.0f, 64.0f)
                curveTo(16.58f, 64.0f, 0.0f, 81.38f, 0.0f, 102.77f)
                lineTo(0.0f, 409.19f)
                curveTo(0.0f, 430.59f, 16.58f, 448.0f, 37.0f, 448.0f)
                lineTo(475.0f, 448.0f)
                curveToRelative(20.38f, 0.0f, 37.0f, -17.41f, 37.0f, -38.81f)
                lineTo(512.0f, 102.77f)
                curveTo(512.0f, 81.38f, 495.42f, 64.0f, 475.0f, 64.0f)
                close()
                moveTo(288.0f, 368.0f)
                lineTo(224.0f, 368.0f)
                lineTo(224.0f, 256.0f)
                lineToRelative(-48.0f, 64.0f)
                lineToRelative(-48.0f, -64.0f)
                lineTo(128.0f, 368.0f)
                lineTo(64.0f, 368.0f)
                lineTo(64.0f, 144.0f)
                horizontalLineToRelative(64.0f)
                lineToRelative(48.0f, 80.0f)
                lineToRelative(48.0f, -80.0f)
                horizontalLineToRelative(64.0f)
                close()
                moveTo(384.0f, 368.0f)
                lineTo(304.0f, 256.0f)
                horizontalLineToRelative(48.05f)
                lineTo(352.0f, 144.0f)
                horizontalLineToRelative(64.0f)
                lineTo(416.0f, 256.0f)
                horizontalLineToRelative(48.0f)
                close()
            }
        }
        .build()
        return _logoMarkdown!!
    }

private var _logoMarkdown: ImageVector? = null
