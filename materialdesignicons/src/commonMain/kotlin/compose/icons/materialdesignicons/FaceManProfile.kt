package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.FaceManProfile: ImageVector
    get() {
        if (_faceManProfile != null) {
            return _faceManProfile!!
        }
        _faceManProfile = Builder(name = "FaceManProfile", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 2.0f)
                moveTo(12.0f, 8.39f)
                curveTo(13.57f, 9.4f, 15.42f, 10.0f, 17.42f, 10.0f)
                curveTo(18.2f, 10.0f, 18.95f, 9.91f, 19.67f, 9.74f)
                curveTo(19.88f, 10.45f, 20.0f, 11.21f, 20.0f, 12.0f)
                curveTo(20.0f, 16.41f, 16.41f, 20.0f, 12.0f, 20.0f)
                curveTo(9.0f, 20.0f, 6.39f, 18.34f, 5.0f, 15.89f)
                lineTo(6.75f, 14.0f)
                verticalLineTo(13.0f)
                arcTo(1.25f, 1.25f, 0.0f, false, true, 8.0f, 11.75f)
                arcTo(1.25f, 1.25f, 0.0f, false, true, 9.25f, 13.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(12.0f)
                moveTo(16.0f, 11.75f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 14.75f, 13.0f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 16.0f, 14.25f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 17.25f, 13.0f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 16.0f, 11.75f)
                close()
            }
        }
        .build()
        return _faceManProfile!!
    }

private var _faceManProfile: ImageVector? = null
