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

public val IonIcons.ArrowUndo: ImageVector
    get() {
        if (_arrowUndo != null) {
            return _arrowUndo!!
        }
        _arrowUndo = Builder(name = "ArrowUndo", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 440.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -12.61f, -6.15f)
                curveToRelative(-22.86f, -29.27f, -44.07f, -51.86f, -73.32f, -67.0f)
                curveTo(335.0f, 352.88f, 301.0f, 345.59f, 256.0f, 344.23f)
                verticalLineTo(424.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 229.0f, 435.57f)
                lineToRelative(-176.0f, -168.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, -23.14f)
                lineToRelative(176.0f, -168.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 256.0f, 88.0f)
                verticalLineToRelative(80.36f)
                curveToRelative(74.14f, 3.41f, 129.38f, 30.91f, 164.35f, 81.87f)
                curveTo(449.32f, 292.44f, 464.0f, 350.9f, 464.0f, 424.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                close()
            }
        }
        .build()
        return _arrowUndo!!
    }

private var _arrowUndo: ImageVector? = null
